package typings.plottable.entityStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/utils/entityStore", "EntityStore")
@js.native
class EntityStore[T /* <: IPositionedEntity */] () extends IEntityStore[T] {
  
  var _entities: js.Any = js.native
  
  var _rtree: js.Any = js.native
}
