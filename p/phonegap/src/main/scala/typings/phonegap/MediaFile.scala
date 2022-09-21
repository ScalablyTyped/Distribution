package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaFile extends StObject {
  
  var fullPath: String = js.native
  
  def getFormatData(successCallback: js.Function): Unit = js.native
  def getFormatData(successCallback: js.Function, errorCallback: js.Function): Unit = js.native
  
  var lastModifiedDate: js.Date = js.native
  
  var name: String = js.native
  
  var size: Double = js.native
  
  var `type`: String = js.native
}
