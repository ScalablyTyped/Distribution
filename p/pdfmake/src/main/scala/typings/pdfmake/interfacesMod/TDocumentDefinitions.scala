package typings.pdfmake.interfacesMod

import typings.pdfkit.PDFKit.DocumentPermissions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TDocumentDefinitions extends StObject {
  
  /**
    * Content that is rendered behind the document's {@link content}, and repeated for every page.
    *
    * Independent of the configured {@link pageMargins}.
    */
  var background: js.UndefOr[DynamicBackground | Content] = js.undefined
  
  /**
    * Controls whether to compress the resulting PDF document.
    *
    * Regardless of this value, any image files added to the document are embedded without
    * recompression. This flag merely applies a lossless compression (similar to ZIP compression)
    * to the whole finished PDF document.
    *
    * To control the size of the resulting PDF file and the quality of its images, optimize your
    * image files before adding them:
    * - For line art, try to find an SVG file, which often offers better quality at smaller file sizes.
    * - Downscale large raster images to the smallest size that still looks good.
    * - Use the file format (JPEG/PNG) and compression settings that yield the best compromise
    *   between file size and quality.
    *
    * Defaults to `true`.
    */
  var compress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Main content of the document.
    *
    * Rendered inside the configured {@link pageMargins}.
    */
  var content: Content
  
  /**
    * Default styles that apply to the complete document.
    */
  var defaultStyle: js.UndefOr[Style] = js.undefined
  
  /**
    * Footer content that is repeated on every page.
    *
    * **Note:** If the footer's content exceeds the available space as defined by
    * {@link pageMargins}, it is not rendered at all.
    */
  var footer: js.UndefOr[DynamicContent | Content] = js.undefined
  
  /**
    * Header content that is repeated on every page.
    *
    * **Note:** If the header's content exceeds the available space as defined by
    * {@link pageMargins}, it is not rendered at all.
    */
  var header: js.UndefOr[DynamicContent | Content] = js.undefined
  
  /**
    * Dictionary of images to be embedded into the document.
    *
    * The specified images can be referenced from content elements by their key.
    *
    * Available options:
    * - A data URL
    * - A remote URL via http:// or https://
    * - An object including a URL and additional HTTP headers
    *
    * Supported image formats: JPEG, PNG
    *
    * SVG images can only be used in the document content using the `svg` property.
    */
  var images: js.UndefOr[Record[String, String | ImageDefinition]] = js.undefined
  
  /**
    * Metadata to embed into the document.
    */
  var info: js.UndefOr[TDocumentInformation] = js.undefined
  
  /**
    * Password required to get full access to the document.
    *
    * Use in combination with {@link permissions}.
    *
    * An empty string is treated as "no password".
    *
    * Does not encrypt the document; use {@link userPassword} for that.
    */
  var ownerPassword: js.UndefOr[String] = js.undefined
  
  /**
    * Callback to determine where to break pages.
    * Called repeatedly until no more page breaks are added.
    *
    * Not called for nodes that have `pageBreak: 'before'` set.
    *
    * @param currentNode - The current content node to check.
    * @param followingNodesOnPage - The content nodes defined after the current node on the same page.
    * @param nodesOnNextPage - The content nodes on the page after the current node's page.
    * @param previousNodesOnPage - The content nodes defined before the current node on the same page.
    *
    * @returns whether to insert a page break before the current node.
    */
  var pageBreakBefore: js.UndefOr[
    js.Function4[
      /* currentNode */ Node, 
      /* followingNodesOnPage */ js.Array[Node], 
      /* nodesOnNextPage */ js.Array[Node], 
      /* previousNodesOnPage */ js.Array[Node], 
      Boolean
    ]
  ] = js.undefined
  
  /**
    * Margins around the {@link content} on each page.
    *
    * If a {@link header} or {@link footer} is specified, the page margins must
    * leave sufficient room for it to be rendered at all.
    *
    * Defaults to `40`.
    */
  var pageMargins: js.UndefOr[Margins] = js.undefined
  
  /**
    * Orientation of the document's pages.
    *
    * Defaults to `portrait` for standard page sizes; if a custom {@link pageSize} is given,
    * it defaults to the orientation set through its width and height.
    */
  var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
  
  /**
    * Size of the document's pages.
    *
    * Defaults to `A4`.
    */
  var pageSize: js.UndefOr[PageSize] = js.undefined
  
  /**
    * Dictionary of reusable pattern definitions that can be referenced by their key.
    */
  var patterns: js.UndefOr[Record[String, Pattern]] = js.undefined
  
  /**
    * Permissions for accessing or modifying the document in different ways.
    *
    * The PDF file cannot enforce these permissions by itself.
    * It relies on PDF viewer applications to respect them.
    *
    * Only relevant if {@link ownerPassword} is set.
    *
    * Defaults to `{}` (everything is forbidden)
    */
  var permissions: js.UndefOr[DocumentPermissions] = js.undefined
  
  /**
    * Dictionary for reusable styles to be referenced by their key throughout the document.
    *
    * To define styles that should apply by default, use {@link defaultStyles} instead.
    */
  var styles: js.UndefOr[StyleDictionary] = js.undefined
  
  /**
    * Password required to open the document.
    *
    * If set, the document is encrypted.
    * Setting the {@link version} influences the encryption method used.
    *
    * An empty string is treated as "no password".
    */
  var userPassword: js.UndefOr[String] = js.undefined
  
  /**
    * Version of the PDF specification the document is created with.
    *
    * Influences the encryption method used in combination with {@link userPassword}.
    * The PDF content is always created with version 1.3.
    *
    * Defaults to `1.3`.
    */
  var version: js.UndefOr[PDFVersion] = js.undefined
  
  /**
    * Watermark that is rendered on top of each page.
    */
  var watermark: js.UndefOr[String | Watermark] = js.undefined
}
object TDocumentDefinitions {
  
  inline def apply(content: Content): TDocumentDefinitions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDocumentDefinitions]
  }
  
  extension [Self <: TDocumentDefinitions](x: Self) {
    
    inline def setBackground(value: DynamicBackground | Content): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBackgroundVarargs(value: Any*): Self = StObject.set(x, "background", js.Array(value*))
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setContent(value: Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: Any*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setDefaultStyle(value: Style): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
    
    inline def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
    
    inline def setFooter(value: DynamicContent | Content): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFooterVarargs(value: Any*): Self = StObject.set(x, "footer", js.Array(value*))
    
    inline def setHeader(value: DynamicContent | Content): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeaderVarargs(value: Any*): Self = StObject.set(x, "header", js.Array(value*))
    
    inline def setImages(value: Record[String, String | ImageDefinition]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setInfo(value: TDocumentInformation): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
    
    inline def setOwnerPasswordUndefined: Self = StObject.set(x, "ownerPassword", js.undefined)
    
    inline def setPageBreakBefore(
      value: (/* currentNode */ Node, /* followingNodesOnPage */ js.Array[Node], /* nodesOnNextPage */ js.Array[Node], /* previousNodesOnPage */ js.Array[Node]) => Boolean
    ): Self = StObject.set(x, "pageBreakBefore", js.Any.fromFunction4(value))
    
    inline def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
    
    inline def setPageMargins(value: Margins): Self = StObject.set(x, "pageMargins", value.asInstanceOf[js.Any])
    
    inline def setPageMarginsUndefined: Self = StObject.set(x, "pageMargins", js.undefined)
    
    inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
    
    inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
    
    inline def setPageSize(value: PageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPatterns(value: Record[String, Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
    
    inline def setPermissions(value: DocumentPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setStyles(value: StyleDictionary): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setUserPassword(value: String): Self = StObject.set(x, "userPassword", value.asInstanceOf[js.Any])
    
    inline def setUserPasswordUndefined: Self = StObject.set(x, "userPassword", js.undefined)
    
    inline def setVersion(value: PDFVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWatermark(value: String | Watermark): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
    
    inline def setWatermarkUndefined: Self = StObject.set(x, "watermark", js.undefined)
  }
}
