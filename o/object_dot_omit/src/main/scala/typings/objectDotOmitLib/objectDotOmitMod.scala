package typings
package objectDotOmitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("object.omit", JSImport.Namespace)
@js.native
object objectDotOmitMod extends js.Object {
  def apply[GObject /* <: js.Object */, GKey /* <: java.lang.String */](
    `object`: GObject,
    fn: js.Function3[
      /* import warning: ImportType.apply Failed type conversion: GObject[GKey] */ /* value */ js.Any, 
      /* key */ GKey, 
      /* obj */ GObject, 
      scala.Boolean
    ]
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
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
  def apply[GObject /* <: js.Object */, GKey /* <: java.lang.String */](`object`: GObject, key: GKey | js.Array[GKey]): objectDotOmitLib.Omit[GObject, GKey] = js.native
}

