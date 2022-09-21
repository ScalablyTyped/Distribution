package typings.mfiles.global.MFiles

import typings.mfiles.IOCROptions
import typings.mfiles.IOCRZone
import typings.mfiles.MFiles.MFDataType
import typings.mfiles.MFiles.MFOCRDimensionUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.OCRZone")
@js.native
open class OCRZone ()
  extends StObject
     with IOCRZone {
  
  /* CompleteClass */
  var Barcode: Boolean = js.native
  
  /* CompleteClass */
  override def ClearOCROptions(): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IOCRZone = js.native
  
  /* CompleteClass */
  var DataType: MFDataType = js.native
  
  /* CompleteClass */
  var DimensionUnit: MFOCRDimensionUnit = js.native
  
  /* CompleteClass */
  override val HasOCROptions: Boolean = js.native
  
  /* CompleteClass */
  var Height: Double = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var Left: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var OCROptions: IOCROptions = js.native
  
  /* CompleteClass */
  override def SetOCROptions(OCROptions: IOCROptions): Unit = js.native
  
  /* CompleteClass */
  var Top: Double = js.native
  
  /* CompleteClass */
  var Width: Double = js.native
}
