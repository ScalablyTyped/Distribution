package typings.photoshop

import typings.photoshop.anon.Get
import typings.photoshop.createOptionsMod.DocumentCreateOptions
import typings.photoshop.documentMod.Document
import typings.photoshop.photoshopMod.Photoshop
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentsMod {
  
  @JSImport("photoshop/dom/collections/Documents", "Documents")
  @js.native
  /** @ignore */
  open class Documents ()
    extends StObject
       with Array[Document] {
    
    /**
      * Create a new document.
      *
      * No options will create a document of 7 x 5 inches at 300 pixels per inch.
      * This is the same as the "Default Photoshop Size" preset.
      *
      * An object with a 'preset' string parameter can be used to specify any of
      * the other presets that come installed with Photoshop or created by users.
      *
      * An object with one or more parameters can also be supplied. Any parameter
      * missing will be set to the default of: width 2100 pixels, height 1500 pixels,
      * resolution 300 pixels per inch, mode: @RGBColorMode and a fill of white with
      * no transparency.
      *
      * @param options @DocumentCreateOptions
      *
      * @async
      * ```javascript
      * // "Default Photoshop Size" 7x5 inches at 300ppi
      * let newDoc1 = await app.documents.add();
      * let newDoc2 = await app.documents.add({
      *    width: 800,
      *    height: 600,
      *    resolution: 300,
      *    mode: "RGBColorMode",
      *    fill: "transparent"
      * });
      * let newDoc3 = await app.documents.add({preset: "My Default Size 1"});
      * ```
      */
    def add(): js.Promise[Document | Null] = js.native
    def add(options: DocumentCreateOptions): js.Promise[Document | Null] = js.native
    
    /**
      * Find the first document with the matching name
      */
    def getByName(name: String): Document = js.native
    
    /** @ignore */
    def handler(): Get = js.native
    
    /**
      * Number of [[Document]] elements in this collection
      */
    @JSName("length")
    def length_MDocuments: Double = js.native
    
    /**
      * The owner application of this Documents collection
      */
    def parent: Photoshop = js.native
    
    /** @ignore */
    /* private */ var proxy: Any = js.native
    
    /**
      * The name for this object collection: Documents
      */
    def typename: String = js.native
  }
}
