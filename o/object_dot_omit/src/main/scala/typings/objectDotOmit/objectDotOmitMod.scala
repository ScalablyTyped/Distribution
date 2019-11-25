package typings.objectDotOmit

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("object.omit", JSImport.Namespace)
@js.native
object objectDotOmitMod extends js.Object {
  def apply[GObject /* <: js.Object */, GKey /* <: String */](
    `object`: GObject,
    fn: js.Function3[
      /* import warning: importer.ImportType#apply Failed type conversion: GObject[GKey] */ /* value */ js.Any, 
      /* key */ GKey, 
      /* obj */ GObject, 
      Boolean
    ]
  ): StringDictionary[js.Any] = js.native
  /**
    * Return a copy of an object excluding the given key, or array of keys. Also accepts an optional filter function as the last argument."
    *
    * ```ts
    * omit({a: 'a', b: 'b', c: 'c'}, ['a', 'c'])
    * //=> { b: 'b' }
    * ```
    *
    * @param object
    * @param keys
    */
  def apply[GObject /* <: js.Object */, GKey /* <: String */](`object`: GObject, key: GKey): Omit[GObject, GKey] = js.native
  def apply[GObject /* <: js.Object */, GKey /* <: String */](`object`: GObject, key: js.Array[GKey]): Omit[GObject, GKey] = js.native
}

