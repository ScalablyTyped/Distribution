package typings.photoshop

import typings.photoshop.constantsMod.Direction
import typings.photoshop.documentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guideMod {
  
  @JSImport("photoshop/dom/Guide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("photoshop/dom/Guide", "Guide")
  @js.native
  open class Guide protected () extends StObject {
    /**
      * @ignore
      */
    def this(id: Double, docId: Double) = this()
    
    /**
      * Location of the guide from origin of image, in float units.
      *
      * In the future, we will accept a UnitValue here, supporting number input for floatUnit
      */
    def coordinate: Double = js.native
    def coordinate_=(coordinate: Double): Unit = js.native
    
    /**
      * Deletes the guide from the document.
      */
    def delete(): Unit = js.native
    
    /**
      * Indicates whether the guide is vertical or horizontal
      */
    def direction: Direction = js.native
    def direction_=(direction: Direction): Unit = js.native
    
    /**
      * The ID of the document of this guide.
      */
    def docId: Double = js.native
    
    /**
      * For use with batchPlay operations. This guide ID, along with its document ID
      * can be used to represent this guide for the lifetime of this document or the guide.
      */
    def id: Double = js.native
    
    /**
      * Owner document of this guide
      */
    def parent: Document = js.native
    
    /**
      * The class name of the referenced Guide object
      */
    def typename: String = js.native
  }
  
  inline def PSGuide(id: Double, docId: Double): Guide = (^.asInstanceOf[js.Dynamic].applyDynamic("PSGuide")(id.asInstanceOf[js.Any], docId.asInstanceOf[js.Any])).asInstanceOf[Guide]
}
