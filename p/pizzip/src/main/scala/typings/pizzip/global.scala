package typings.pizzip

import typings.pizzip.mod.LoadData
import typings.pizzip.mod.LoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object PizZip {
    
    @JSGlobal("PizZip")
    @js.native
    open class ^ ()
      extends typings.pizzip.mod.^ {
      /**
        * Specifying data & options is a shortcut for new PizZip().load(data, options);
        *
        * @param data the zip file
        * @param options the options to load the zip file
        */
      // tslint:disable-next-line unified-signatures new (undefined, {options}) is not an acceptable input
      def this(data: LoadData) = this()
      def this(data: LoadData, options: LoadOptions) = this()
    }
    
    /**
      * If the browser supports them, PizZip can take advantage of some "new" features : ArrayBuffer, Blob, Uint8Array.
      * To know if PizZip can use them, you can check the PizZip.support object.
      */
    /* static member */
    object support {
      
      @JSGlobal("PizZip.support")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * true if PizZip can read and generate ArrayBuffer, false otherwise.
        */
      @JSGlobal("PizZip.support.arraybuffer")
      @js.native
      def arraybuffer: Boolean = js.native
      inline def arraybuffer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arraybuffer")(x.asInstanceOf[js.Any])
      
      /**
        * true if PizZip can read and generate Blob, false otherwise.
        */
      @JSGlobal("PizZip.support.blob")
      @js.native
      def blob: Boolean = js.native
      inline def blob_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blob")(x.asInstanceOf[js.Any])
      
      /**
        * true if PizZip can read and generate nodejs Buffer, false otherwise.
        */
      @JSGlobal("PizZip.support.nodebuffer")
      @js.native
      def nodebuffer: Boolean = js.native
      inline def nodebuffer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodebuffer")(x.asInstanceOf[js.Any])
      
      /**
        * true if PizZip can read and generate Uint8Array, false otherwise.
        */
      @JSGlobal("PizZip.support.uint8array")
      @js.native
      def uint8array: Boolean = js.native
      inline def uint8array_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint8array")(x.asInstanceOf[js.Any])
    }
  }
}
