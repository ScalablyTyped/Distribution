package typings.objectOmit

import org.scalablytyped.runtime.StringDictionary
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[GObject /* <: js.Object */, GKey /* <: /* keyof GObject */ String */](
    `object`: GObject,
    fn: js.Function3[
      /* import warning: importer.ImportType#apply Failed type conversion: GObject[GKey] */ /* value */ js.Any, 
      /* key */ GKey, 
      /* obj */ GObject, 
      Boolean
    ]
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
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
  inline def apply[GObject /* <: js.Object */, GKey /* <: /* keyof GObject */ String */](`object`: GObject, key: GKey): Omit[GObject, GKey] = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Omit[GObject, GKey]]
  inline def apply[GObject /* <: js.Object */, GKey /* <: /* keyof GObject */ String */](`object`: GObject, key: js.Array[GKey]): Omit[GObject, GKey] = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Omit[GObject, GKey]]
  
  @JSImport("object.omit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Omit[GType, GKeys /* <: /* keyof GType */ String */] = Pick[GType, Exclude[/* keyof GType */ String, GKeys]]
}
