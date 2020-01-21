package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object modalTypesMod {
  type IModalStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.modalTypesMod.IModalProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.modalTypesMod.IModalProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.className | typings.officeUiFabricReact.officeUiFabricReactStrings.containerClassName | typings.officeUiFabricReact.officeUiFabricReactStrings.scrollableContentClassName | typings.officeUiFabricReact.officeUiFabricReactStrings.topOffsetFixed | typings.officeUiFabricReact.officeUiFabricReactStrings.isModeless
  ]) with typings.officeUiFabricReact.AnonHasBeenOpened
}
