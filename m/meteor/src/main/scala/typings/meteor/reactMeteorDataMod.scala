package typings.meteor

import typings.meteor.anon.GetMeteorData
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMeteorDataMod {
  
  @JSImport("meteor/react-meteor-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useTracker[TDataProps](getMeteorData: js.Function0[TDataProps]): TDataProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useTracker")(getMeteorData.asInstanceOf[js.Any]).asInstanceOf[TDataProps]
  @scala.inline
  def useTracker[TDataProps](getMeteorData: js.Function0[TDataProps], deps: DependencyList): TDataProps = (^.asInstanceOf[js.Dynamic].applyDynamic("useTracker")(getMeteorData.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[TDataProps]
  
  @scala.inline
  def withTracker[TDataProps, TOwnProps](options: js.Function1[/* props */ TOwnProps, TDataProps | (GetMeteorData[TOwnProps, TDataProps])]): js.Function1[
    /* reactComponent */ ComponentType[TOwnProps & TDataProps], 
    ComponentClass[TOwnProps, ComponentState]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTracker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* reactComponent */ ComponentType[TOwnProps & TDataProps], 
    ComponentClass[TOwnProps, ComponentState]
  ]]
}
