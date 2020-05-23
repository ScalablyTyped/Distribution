package typings.meteor

import typings.meteor.anon.GetMeteorData
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.DependencyList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/react-meteor-data", JSImport.Namespace)
@js.native
object reactMeteorDataMod extends js.Object {
  def useTracker[TDataProps](getMeteorData: js.Function0[TDataProps]): TDataProps = js.native
  def useTracker[TDataProps](getMeteorData: js.Function0[TDataProps], deps: DependencyList): TDataProps = js.native
  def withTracker[TDataProps, TOwnProps](options: js.Function1[/* props */ TOwnProps, TDataProps | (GetMeteorData[TOwnProps, TDataProps])]): js.Function1[
    /* reactComponent */ ComponentType[TOwnProps with TDataProps], 
    ComponentClass[TOwnProps, ComponentState]
  ] = js.native
}

