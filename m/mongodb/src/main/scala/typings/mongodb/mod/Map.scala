package typings.mongodb.mod

import typings.mongodb.mod.^
import typings.std.MapConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("mongodb", "Map")
@js.native
/* standard es2015.collection */
open class Map[K, V] ()
  extends StObject
     with typings.std.Map[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
}
object Map {
  
  /** @public */
  inline def apply: MapConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Map").asInstanceOf[MapConstructor]
}
