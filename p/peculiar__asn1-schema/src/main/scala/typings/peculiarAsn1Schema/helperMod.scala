package typings.peculiarAsn1Schema

import typings.peculiarAsn1Schema.typesMod.IEmptyConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("@peculiar/asn1-schema/build/types/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isArrayEqual(bytes1: js.typedarray.ArrayBuffer, bytes2: js.typedarray.ArrayBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayEqual")(bytes1.asInstanceOf[js.Any], bytes2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isConvertible(target: Any): /* is @peculiar/asn1-schema.@peculiar/asn1-schema/build/types/types.IAsnConvertible<asn1js.asn1js.AsnType> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConvertible")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @peculiar/asn1-schema.@peculiar/asn1-schema/build/types/types.IAsnConvertible<asn1js.asn1js.AsnType> */ Boolean]
  inline def isConvertible(target: IEmptyConstructor[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConvertible")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTypeOfArray(target: Any): /* is std.ArrayConstructor */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfArray")(target.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayConstructor */ Boolean]
}
