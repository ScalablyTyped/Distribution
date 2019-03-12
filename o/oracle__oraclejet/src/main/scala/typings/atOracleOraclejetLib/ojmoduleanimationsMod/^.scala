package typings
package atOracleOraclejetLib.ojmoduleanimationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojmoduleanimations", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var coverStart: atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  var coverUp: atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  var fade: atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  var navChild: atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  var navParent: atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  var navSiblingEarlier: atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  var navSiblingLater: atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  var pushEnd: atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  var pushStart: atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  var revealDown: atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  var revealEnd: atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  var zoomIn: atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  var zoomOut: atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  def createAnimation(
    oldViewEffect: atOracleOraclejetLib.Anon_Effect,
    newViewEffect: atOracleOraclejetLib.Anon_Effect,
    newViewOnTop: scala.Boolean
  ): atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  def createAnimation(
    oldViewEffect: atOracleOraclejetLib.Anon_Effect,
    newViewEffect: atOracleOraclejetLib.ojanimationMod.AnimationMethods,
    newViewOnTop: scala.Boolean
  ): atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  def createAnimation(
    oldViewEffect: atOracleOraclejetLib.Anon_Effect,
    newViewEffect: scala.Null,
    newViewOnTop: scala.Boolean
  ): atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  def createAnimation(
    oldViewEffect: atOracleOraclejetLib.ojanimationMod.AnimationMethods,
    newViewEffect: atOracleOraclejetLib.Anon_Effect,
    newViewOnTop: scala.Boolean
  ): atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  def createAnimation(
    oldViewEffect: atOracleOraclejetLib.ojanimationMod.AnimationMethods,
    newViewEffect: atOracleOraclejetLib.ojanimationMod.AnimationMethods,
    newViewOnTop: scala.Boolean
  ): atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  def createAnimation(
    oldViewEffect: atOracleOraclejetLib.ojanimationMod.AnimationMethods,
    newViewEffect: scala.Null,
    newViewOnTop: scala.Boolean
  ): atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  def createAnimation(
    oldViewEffect: scala.Null,
    newViewEffect: atOracleOraclejetLib.Anon_Effect,
    newViewOnTop: scala.Boolean
  ): atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  def createAnimation(
    oldViewEffect: scala.Null,
    newViewEffect: atOracleOraclejetLib.ojanimationMod.AnimationMethods,
    newViewOnTop: scala.Boolean
  ): atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  def createAnimation(oldViewEffect: scala.Null, newViewEffect: scala.Null, newViewOnTop: scala.Boolean): atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
  def switcher(callback: js.Function1[/* param0 */ SwitcherCallBackParam, Animations]): atOracleOraclejetLib.ojmoduleDashElementMod.ModuleElementAnimation = js.native
}

