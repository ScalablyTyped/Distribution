package typings.photoshop

import typings.photoshop.domConstantsMod.Direction
import typings.photoshop.domDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domGuideMod {
  
  @JSImport("photoshop/dom/Guide", "Guide")
  @js.native
  open class Guide protected () extends StObject {
    /**
      * @ignore
      */
    def this(id: Double, docId: Double) = this()
    
    /**
      * Position of the guide measured from the ruler origin in pixels. The value can be a decimal number.
      *
      * Note: the user can move the ruler origin which will affect the position value of the guides.
      *
      * ***Fixes in Photoshop 24.0:***
      * - *Return correct value when resolution is not 72 PPI*
      *
      * @minVersion 23.0
      */
    def coordinate: Double = js.native
    /**
      * Position of the guide measured from the ruler origin in pixels. The value can be a decimal number.
      *
      * Note: the user can move the ruler origin which will affect the position value of the guides.
      *
      * ***Fixes in Photoshop 24.0:***
      * - *Sets correct value when resolution is not 72 PPI*
      *
      */
    def coordinate_=(coordinate: Double): Unit = js.native
    
    /**
      * Deletes the guide from the document.
      * @minVersion 23.0
      */
    def delete(): Unit = js.native
    
    /**
      * Indicates whether the guide is vertical or horizontal.
      * @minVersion 23.0
      */
    def direction: Direction = js.native
    def direction_=(direction: Direction): Unit = js.native
    
    /**
      * The ID of the document of this guide.
      * @minVersion 23.0
      */
    def docId: Double = js.native
    
    /**
      * For use with batchPlay operations. This guide ID, along with its document ID
      * can be used to represent this guide for the lifetime of this document or the guide.
      * @minVersion 23.0
      */
    def id: Double = js.native
    
    /**
      * Owner document of this guide.
      * @minVersion 23.0
      */
    def parent: Document = js.native
    
    /**
      * The class name of the referenced object: *"Guide"*.
      * @minVersion 23.0
      */
    def typename: typings.photoshop.photoshopStrings.Guide = js.native
  }
}
