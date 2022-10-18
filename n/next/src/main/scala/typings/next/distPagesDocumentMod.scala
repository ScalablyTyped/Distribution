package typings.next

import typings.next.anon.ReadonlyHtmlProps
import typings.next.distSharedLibHtmlContextMod.HtmlProps
import typings.next.distSharedLibUtilsMod.DocumentContext
import typings.next.distSharedLibUtilsMod.DocumentInitialProps
import typings.next.distSharedLibUtilsMod.DocumentProps
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.HtmlHTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLHeadElement
import typings.std.HTMLHtmlElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPagesDocumentMod {
  
  @JSImport("next/dist/pages/_document", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/pages/_document", JSImport.Default)
  @js.native
  open class default[P] () extends Document[P]
  /* static members */
  object default {
    
    @JSImport("next/dist/pages/_document", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * `getInitialProps` hook returns the context object with the addition of `renderPage`.
      * `renderPage` callback executes `React` rendering logic synchronously to support server-rendering wrappers
      */
    inline def getInitialProps(ctx: DocumentContext): js.Promise[DocumentInitialProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialProps")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DocumentInitialProps]]
  }
  
  @JSImport("next/dist/pages/_document", "Head")
  @js.native
  open class Head protected ()
    extends Component[HeadProps, js.Object, Any] {
    def this(props: HeadProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HeadProps, context: Any) = this()
    
    @JSName("context")
    var context_Head: ContextType[Context[HtmlProps]] = js.native
    
    def getBeforeInteractiveInlineScripts(): js.Array[Element] = js.native
    
    def getCssLinks(files: DocumentFiles): js.Array[Element] | Null = js.native
    
    def getDynamicChunks(files: DocumentFiles): js.Array[Element | Null] = js.native
    
    def getPolyfillScripts(): js.Array[Element] = js.native
    
    def getPreNextScripts(): Element = js.native
    
    def getPreloadDynamicChunks(): js.Array[Element | Null] = js.native
    
    def getPreloadMainLinks(files: DocumentFiles): js.Array[Element] | Null = js.native
    
    def getScripts(files: DocumentFiles): js.Array[Element] = js.native
    
    def makeStylesheetInert(node: ReactNode): js.Array[ReactNode] = js.native
  }
  /* static members */
  object Head {
    
    @JSImport("next/dist/pages/_document", "Head")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/pages/_document", "Head.contextType")
    @js.native
    def contextType: Context[HtmlProps] = js.native
    inline def contextType_=(x: Context[HtmlProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  inline def Html(props: DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Html")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Main(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Main")().asInstanceOf[Element]
  
  @JSImport("next/dist/pages/_document", "NextScript")
  @js.native
  open class NextScript protected ()
    extends Component[OriginProps, js.Object, Any] {
    def this(props: OriginProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OriginProps, context: Any) = this()
    
    @JSName("context")
    var context_NextScript: ContextType[Context[HtmlProps]] = js.native
    
    def getDynamicChunks(files: DocumentFiles): js.Array[Element | Null] = js.native
    
    def getPolyfillScripts(): js.Array[Element] = js.native
    
    def getPreNextScripts(): Element = js.native
    
    def getScripts(files: DocumentFiles): js.Array[Element] = js.native
  }
  /* static members */
  object NextScript {
    
    @JSImport("next/dist/pages/_document", "NextScript")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/pages/_document", "NextScript.contextType")
    @js.native
    def contextType: Context[HtmlProps] = js.native
    inline def contextType_=(x: Context[HtmlProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    inline def getInlineScriptSource(context: ReadonlyHtmlProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInlineScriptSource")(context.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @js.native
  trait Document[P]
    extends Component[DocumentProps & P, js.Object, Any]
  
  trait DocumentFiles extends StObject {
    
    var allFiles: js.Array[String]
    
    var pageFiles: js.Array[String]
    
    var sharedFiles: js.Array[String]
  }
  object DocumentFiles {
    
    inline def apply(allFiles: js.Array[String], pageFiles: js.Array[String], sharedFiles: js.Array[String]): DocumentFiles = {
      val __obj = js.Dynamic.literal(allFiles = allFiles.asInstanceOf[js.Any], pageFiles = pageFiles.asInstanceOf[js.Any], sharedFiles = sharedFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentFiles]
    }
    
    extension [Self <: DocumentFiles](x: Self) {
      
      inline def setAllFiles(value: js.Array[String]): Self = StObject.set(x, "allFiles", value.asInstanceOf[js.Any])
      
      inline def setAllFilesVarargs(value: String*): Self = StObject.set(x, "allFiles", js.Array(value*))
      
      inline def setPageFiles(value: js.Array[String]): Self = StObject.set(x, "pageFiles", value.asInstanceOf[js.Any])
      
      inline def setPageFilesVarargs(value: String*): Self = StObject.set(x, "pageFiles", js.Array(value*))
      
      inline def setSharedFiles(value: js.Array[String]): Self = StObject.set(x, "sharedFiles", value.asInstanceOf[js.Any])
      
      inline def setSharedFilesVarargs(value: String*): Self = StObject.set(x, "sharedFiles", js.Array(value*))
    }
  }
  
  type HeadHTMLProps = DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement]
  
  type HeadProps = OriginProps & HeadHTMLProps
  
  trait OriginProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
  }
  object OriginProps {
    
    inline def apply(): OriginProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OriginProps]
    }
    
    extension [Self <: OriginProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
}
