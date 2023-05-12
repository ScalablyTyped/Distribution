package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.mercadopagoSdkJs.bricks.AdditionalCardFormData
  - typings.mercadopagoSdkJs.bricks.AdditionalSavedCardFormData
  - typings.mercadopagoSdkJs.bricks.AdditionalTicketFormData
*/
type AdditionalPaymentFormData = _AdditionalPaymentFormData | AdditionalTicketFormData

type AdditionalTicketFormData = Record[String, Any]

type CustomizableTexts = StringDictionary[String | StringDictionary[String]]

type GenericPaymentMethod = String | js.Array[String]
