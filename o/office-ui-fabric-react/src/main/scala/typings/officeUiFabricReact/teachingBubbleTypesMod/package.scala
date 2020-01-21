package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object teachingBubbleTypesMod {
  type ITeachingBubbleStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.hasCondensedHeadline | typings.officeUiFabricReact.officeUiFabricReactStrings.hasSmallHeadline | typings.officeUiFabricReact.officeUiFabricReactStrings.isWide
  ]) with typings.officeUiFabricReact.AnonCalloutClassNameHasCloseButton
}
