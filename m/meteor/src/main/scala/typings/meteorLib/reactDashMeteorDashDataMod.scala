package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/react-meteor-data", JSImport.Namespace)
@js.native
object reactDashMeteorDashDataMod extends js.Object {
  def withTracker[TDataProps, TOwnProps](
    options: js.Function1[
      /* props */ TOwnProps, 
      TDataProps | (meteorLib.Anon_GetMeteorData[TOwnProps, TDataProps])
    ]
  ): js.Function1[
    /* reactComponent */ reactLib.reactMod.ReactNs.ComponentType[TOwnProps with TDataProps], 
    reactLib.reactMod.ReactNs.ComponentClass[TOwnProps, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.native
}

