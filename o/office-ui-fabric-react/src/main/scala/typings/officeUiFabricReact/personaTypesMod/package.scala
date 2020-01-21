package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object personaTypesMod {
  type IPersonaPresenceStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.personaTypesMod.IPersonaSharedProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.personaTypesMod.IPersonaSharedProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.presence | typings.officeUiFabricReact.officeUiFabricReactStrings.isOutOfOffice | typings.officeUiFabricReact.officeUiFabricReactStrings.size
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.personaTypesMod.IPersonaProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.className
  ])
}
