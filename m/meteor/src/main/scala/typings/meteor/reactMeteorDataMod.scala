package typings.meteor

import typings.meteor.anon.GetMeteorData
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMeteorDataMod {
  
  @JSImport("meteor/react-meteor-data", "useTracker")
  @js.native
  def useTracker[TDataProps](getMeteorData: js.Function0[TDataProps]): TDataProps = js.native
  @JSImport("meteor/react-meteor-data", "useTracker")
  @js.native
  def useTracker[TDataProps](getMeteorData: js.Function0[TDataProps], deps: DependencyList): TDataProps = js.native
  
  @JSImport("meteor/react-meteor-data", "withTracker")
  @js.native
  def withTracker[TDataProps, TOwnProps](options: js.Function1[/* props */ TOwnProps, TDataProps | (GetMeteorData[TOwnProps, TDataProps])]): js.Function1[
    /* reactComponent */ ComponentType[TOwnProps with TDataProps], 
    ComponentClass[TOwnProps, ComponentState]
  ] = js.native
}
