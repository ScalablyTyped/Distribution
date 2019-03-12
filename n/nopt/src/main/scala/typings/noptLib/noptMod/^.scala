package typings
package noptLib.noptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nopt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var typeDefs: TypeDefs = js.native
  def apply(types: FlagTypeMap): OptionsParsed = js.native
  def apply(types: FlagTypeMap, shorthands: ShortFlags): OptionsParsed = js.native
  def apply(types: FlagTypeMap, shorthands: ShortFlags, args: js.Array[java.lang.String]): OptionsParsed = js.native
  def apply(types: FlagTypeMap, shorthands: ShortFlags, args: js.Array[java.lang.String], slice: scala.Double): OptionsParsed = js.native
  def clean(data: CommandData, types: FlagTypeMap): java.lang.String = js.native
  def clean(data: CommandData, types: FlagTypeMap, typeDefs: TypeDefs): java.lang.String = js.native
}

