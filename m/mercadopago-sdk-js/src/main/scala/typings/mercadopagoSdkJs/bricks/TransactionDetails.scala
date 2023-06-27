package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionDetails extends StObject {
  
  var financial_institution: String
}
object TransactionDetails {
  
  inline def apply(financial_institution: String): TransactionDetails = {
    val __obj = js.Dynamic.literal(financial_institution = financial_institution.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactionDetails] (val x: Self) extends AnyVal {
    
    inline def setFinancial_institution(value: String): Self = StObject.set(x, "financial_institution", value.asInstanceOf[js.Any])
  }
}
