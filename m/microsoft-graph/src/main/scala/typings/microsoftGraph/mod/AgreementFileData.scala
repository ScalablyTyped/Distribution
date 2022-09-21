package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgreementFileData extends StObject {
  
  // Data that represents the terms of use PDF document. Read-only.
  var data: js.UndefOr[NullableOption[String]] = js.undefined
}
object AgreementFileData {
  
  inline def apply(): AgreementFileData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgreementFileData]
  }
  
  extension [Self <: AgreementFileData](x: Self) {
    
    inline def setData(value: NullableOption[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
