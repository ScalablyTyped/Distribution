package typings.popperjsCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandToHashMapMod {
  
  @JSImport("@popperjs/core/lib/utils/expandToHashMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[K /* <: String */](value: String, keys: js.Array[K]): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  @scala.inline
  def default[K /* <: String */](value: Boolean, keys: js.Array[K]): StringDictionary[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Boolean]]
  @scala.inline
  def default[K /* <: String */](value: Double, keys: js.Array[K]): StringDictionary[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Double]]
}
