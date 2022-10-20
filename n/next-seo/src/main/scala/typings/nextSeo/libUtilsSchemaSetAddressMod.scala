package typings.nextSeo

import typings.nextSeo.anon.AddressCountry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetAddressMod {
  
  @JSImport("next-seo/lib/utils/schema/setAddress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setAddress(): js.UndefOr[AddressCountry | js.Array[AddressCountry]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAddress")().asInstanceOf[js.UndefOr[AddressCountry | js.Array[AddressCountry]]]
  inline def setAddress(
    address: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Address */ Any
    ]
  ): js.UndefOr[AddressCountry | js.Array[AddressCountry]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAddress")(address.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[AddressCountry | js.Array[AddressCountry]]]
  inline def setAddress(
    address: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Address */ Any
  ): js.UndefOr[AddressCountry | js.Array[AddressCountry]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAddress")(address.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[AddressCountry | js.Array[AddressCountry]]]
}
