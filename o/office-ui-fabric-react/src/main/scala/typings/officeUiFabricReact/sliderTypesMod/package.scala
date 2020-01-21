package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sliderTypesMod {
  type ISliderStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.sliderTypesMod.ISliderProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.sliderTypesMod.ISliderProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.className | typings.officeUiFabricReact.officeUiFabricReactStrings.disabled | typings.officeUiFabricReact.officeUiFabricReactStrings.vertical
  ]) with typings.officeUiFabricReact.AnonShowTransitions
}
