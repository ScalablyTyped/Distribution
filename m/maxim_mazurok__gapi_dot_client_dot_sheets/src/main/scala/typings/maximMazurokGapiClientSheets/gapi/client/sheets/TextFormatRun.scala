package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFormatRun extends StObject {
  
  /** The format of this run. Absent values inherit the cell's format. */
  var format: js.UndefOr[TextFormat] = js.undefined
  
  /** The character index where this run starts. */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object TextFormatRun {
  
  @scala.inline
  def apply(): TextFormatRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFormatRun]
  }
  
  @scala.inline
  implicit class TextFormatRunMutableBuilder[Self <: TextFormatRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: TextFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
