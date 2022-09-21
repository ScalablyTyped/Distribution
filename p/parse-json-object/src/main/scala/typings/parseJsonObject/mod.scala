package typings.parseJsonObject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-json-object/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any */](text: String, isType: js.Function1[/* value */ js.UndefOr[T], Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], isType.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def parse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any */](text: Unit, isType: js.Function1[/* value */ js.UndefOr[T], Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], isType.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def parseJSONArray[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONArray */ Any */](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSONArray")().asInstanceOf[js.UndefOr[T]]
  inline def parseJSONArray[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONArray */ Any */](text: String): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSONArray")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def parseJSONObject[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any */](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSONObject")().asInstanceOf[js.UndefOr[T]]
  inline def parseJSONObject[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any */](text: String): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSONObject")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def parseJSONValue[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any */](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSONValue")().asInstanceOf[js.UndefOr[T]]
  inline def parseJSONValue[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any */](text: String): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSONValue")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def parseString[T /* <: String */](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")().asInstanceOf[js.UndefOr[T]]
  inline def parseString[T /* <: String */](text: String): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
}
