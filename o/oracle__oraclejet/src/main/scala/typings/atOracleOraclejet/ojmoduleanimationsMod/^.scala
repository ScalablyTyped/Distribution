package typings.atOracleOraclejet.ojmoduleanimationsMod

import typings.atOracleOraclejet.Anon_Effect
import typings.atOracleOraclejet.ojanimationMod.AnimationMethods
import typings.atOracleOraclejet.ojmoduleDashElementMod.ModuleElementAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojmoduleanimations", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var coverStart: ModuleElementAnimation = js.native
  var coverUp: ModuleElementAnimation = js.native
  var fade: ModuleElementAnimation = js.native
  var navChild: ModuleElementAnimation = js.native
  var navParent: ModuleElementAnimation = js.native
  var navSiblingEarlier: ModuleElementAnimation = js.native
  var navSiblingLater: ModuleElementAnimation = js.native
  var pushEnd: ModuleElementAnimation = js.native
  var pushStart: ModuleElementAnimation = js.native
  var revealDown: ModuleElementAnimation = js.native
  var revealEnd: ModuleElementAnimation = js.native
  var zoomIn: ModuleElementAnimation = js.native
  var zoomOut: ModuleElementAnimation = js.native
  def createAnimation(oldViewEffect: Null, newViewEffect: Null, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def createAnimation(oldViewEffect: Null, newViewEffect: Anon_Effect, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def createAnimation(oldViewEffect: Null, newViewEffect: AnimationMethods, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def createAnimation(oldViewEffect: Anon_Effect, newViewEffect: Null, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def createAnimation(oldViewEffect: Anon_Effect, newViewEffect: Anon_Effect, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def createAnimation(oldViewEffect: Anon_Effect, newViewEffect: AnimationMethods, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def createAnimation(oldViewEffect: AnimationMethods, newViewEffect: Null, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def createAnimation(oldViewEffect: AnimationMethods, newViewEffect: Anon_Effect, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def createAnimation(oldViewEffect: AnimationMethods, newViewEffect: AnimationMethods, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def switcher(callback: js.Function1[/* param0 */ SwitcherCallBackParam, Animations]): ModuleElementAnimation = js.native
}

