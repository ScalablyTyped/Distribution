package typings
package noptLib.noptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nopt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var typeDefs: noptLib.noptMod.TypeDefs = js.native
  def apply(types: noptLib.noptMod.FlagTypeMap): noptLib.noptMod.OptionsParsed = js.native
  def apply(types: noptLib.noptMod.FlagTypeMap, shorthands: noptLib.noptMod.ShortFlags): noptLib.noptMod.OptionsParsed = js.native
  def apply(
    types: noptLib.noptMod.FlagTypeMap,
    shorthands: noptLib.noptMod.ShortFlags,
    args: js.Array[java.lang.String]
  ): noptLib.noptMod.OptionsParsed = js.native
  def apply(
    types: noptLib.noptMod.FlagTypeMap,
    shorthands: noptLib.noptMod.ShortFlags,
    args: js.Array[java.lang.String],
    slice: scala.Double
  ): noptLib.noptMod.OptionsParsed = js.native
  def clean(data: noptLib.noptMod.CommandData, types: noptLib.noptMod.FlagTypeMap): java.lang.String = js.native
  def clean(
    data: noptLib.noptMod.CommandData,
    types: noptLib.noptMod.FlagTypeMap,
    typeDefs: noptLib.noptMod.TypeDefs
  ): java.lang.String = js.native
}

