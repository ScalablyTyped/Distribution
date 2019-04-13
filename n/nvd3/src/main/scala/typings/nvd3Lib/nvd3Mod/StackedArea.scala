package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackedArea extends Scatter {
  @JSName("scatter")
  var scatter_Original: Scatter = js.native
  /*A provided function that allows a line to be non-continuous when not defined.*/
  def defined(): js.Function2[/* d */ js.Any, /* i */ scala.Double, scala.Boolean] = js.native
  /*A provided function that allows a line to be non-continuous when not defined.*/
  def defined(func: js.Function2[/* d */ js.Any, /* i */ scala.Double, scala.Boolean]): this.type = js.native
  /*controls the line interpolation between points, many options exist, see the D3 reference:*/
  def interpolate(): java.lang.String = js.native
  /*controls the line interpolation between points, many options exist, see the D3 reference:*/
  def interpolate(value: java.lang.String): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  def offset(offset: java.lang.String): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  def offset(
    offset: js.Function1[/* data */ js.Array[js.Tuple2[scala.Double, scala.Double]], js.Array[scala.Double]]
  ): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  @JSName("offset")
  def offset_expand(offset: nvd3Lib.nvd3LibStrings.expand): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  @JSName("offset")
  def offset_silhouette(offset: nvd3Lib.nvd3LibStrings.silhouette): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  @JSName("offset")
  def offset_wiggle(offset: nvd3Lib.nvd3LibStrings.wiggle): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  @JSName("offset")
  def offset_zero(offset: nvd3Lib.nvd3LibStrings.zero): this.type = js.native
  def order(): java.lang.String = js.native
  def order(value: java.lang.String): this.type = js.native
  def scatter(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def scatter(
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def style(offset: java.lang.String): this.type = js.native
  @JSName("style")
  def style_expand(offset: nvd3Lib.nvd3LibStrings.expand): this.type = js.native
  @JSName("style")
  def style_stack(offset: nvd3Lib.nvd3LibStrings.stack): this.type = js.native
  @JSName("style")
  def style_stack_percent(offset: nvd3Lib.nvd3LibStrings.stack_percent): this.type = js.native
  @JSName("style")
  def style_stream(offset: nvd3Lib.nvd3LibStrings.stream): this.type = js.native
  @JSName("style")
  def `style_stream-center`(offset: nvd3Lib.nvd3LibStrings.`stream-center`): this.type = js.native
}

