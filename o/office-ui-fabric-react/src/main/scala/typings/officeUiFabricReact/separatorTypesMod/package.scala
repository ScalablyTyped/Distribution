package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object separatorTypesMod {
  type ISeparatorStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.separatorTypesMod.ISeparatorProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.separatorTypesMod.ISeparatorProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.className | typings.officeUiFabricReact.officeUiFabricReactStrings.alignContent | typings.officeUiFabricReact.officeUiFabricReactStrings.vertical
  ])
}
