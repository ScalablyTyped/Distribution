package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinLogCoordinates extends StObject {
  
  /** Name of the binary log file for a Cloud SQL instance. */
  var binLogFileName: js.UndefOr[String] = js.native
  
  /** Position (offset) within the binary log file. */
  var binLogPosition: js.UndefOr[String] = js.native
  
  /** This is always *sql#binLogCoordinates*. */
  var kind: js.UndefOr[String] = js.native
}
object BinLogCoordinates {
  
  @scala.inline
  def apply(): BinLogCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinLogCoordinates]
  }
  
  @scala.inline
  implicit class BinLogCoordinatesMutableBuilder[Self <: BinLogCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinLogFileName(value: String): Self = StObject.set(x, "binLogFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinLogFileNameUndefined: Self = StObject.set(x, "binLogFileName", js.undefined)
    
    @scala.inline
    def setBinLogPosition(value: String): Self = StObject.set(x, "binLogPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinLogPositionUndefined: Self = StObject.set(x, "binLogPosition", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
