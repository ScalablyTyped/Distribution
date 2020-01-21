package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object colorSliderTypesMod {
  type IColorSliderStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.colorSliderTypesMod.IColorSliderProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.colorSliderTypesMod.IColorSliderProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.className | typings.officeUiFabricReact.officeUiFabricReactStrings.isAlpha
  ])
}
