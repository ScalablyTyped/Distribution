package typings.muicss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactMod {
  import typings.react.reactMod.HTMLAttributes
  import typings.react.reactMod.OptionHTMLAttributes
  import typings.std.HTMLDivElement
  import typings.std.HTMLOptionElement

  type DivProps = HTMLAttributes[HTMLDivElement]
  type DividerProps = DivProps
  type OptionProps = OptionHTMLAttributes[HTMLOptionElement]
  type PanelProps = DivProps
  type RadioProps = CheckboxProps
}
