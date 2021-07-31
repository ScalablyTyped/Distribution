package typings.mfiles.global.MFiles

import typings.mfiles.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.Timestamp")
@js.native
class Timestamp ()
  extends StObject
     with ITimestamp {
  
  /* CompleteClass */
  override def Clone(): ITimestamp = js.native
  
  /* CompleteClass */
  var Day: Double = js.native
  
  /* CompleteClass */
  var Fraction: Double = js.native
  
  /* CompleteClass */
  override def GetValue(): js.Any = js.native
  
  /* CompleteClass */
  var Hour: Double = js.native
  
  /* CompleteClass */
  override def LocalTimeToUtc(): ITimestamp = js.native
  
  /* CompleteClass */
  var Minute: Double = js.native
  
  /* CompleteClass */
  var Month: Double = js.native
  
  /* CompleteClass */
  var Second: Double = js.native
  
  /* CompleteClass */
  override def SetValue(Value: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def UtcToLocalTime(): ITimestamp = js.native
  
  /* CompleteClass */
  var Year: Double = js.native
}
