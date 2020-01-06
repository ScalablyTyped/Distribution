package typings.meteor

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.DependencyList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/react-meteor-data", JSImport.Namespace)
@js.native
object reactDashMeteorDashDataMod extends js.Object {
  def useTracker[TDataProps](getMeteorData: js.Function0[TDataProps]): TDataProps = js.native
  def useTracker[TDataProps](getMeteorData: js.Function0[TDataProps], deps: DependencyList): TDataProps = js.native
  def withTracker[TDataProps, TOwnProps](
    options: js.Function1[/* props */ TOwnProps, TDataProps | (Anon_GetMeteorData[TOwnProps, TDataProps])]
  ): js.Function1[
    /* reactComponent */ ComponentType[TOwnProps with TDataProps], 
    ComponentClass[TOwnProps, ComponentState]
  ] = js.native
}

