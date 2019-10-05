package typings.nopt.noptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nopt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var typeDefs: TypeDefs = js.native
  def apply(types: FlagTypeMap): OptionsParsed = js.native
  def apply(types: FlagTypeMap, shorthands: ShortFlags): OptionsParsed = js.native
  def apply(types: FlagTypeMap, shorthands: ShortFlags, args: js.Array[String]): OptionsParsed = js.native
  def apply(types: FlagTypeMap, shorthands: ShortFlags, args: js.Array[String], slice: Double): OptionsParsed = js.native
}

