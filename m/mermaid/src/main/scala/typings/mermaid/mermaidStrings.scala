package typings.mermaid

import typings.mermaid.mermaidAPIMod.mermaidAPI.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mermaidStrings {
  @js.native
  sealed trait dark extends Theme
  
  @js.native
  sealed trait default extends Theme
  
  @js.native
  sealed trait forest extends Theme
  
  @js.native
  sealed trait neutral extends Theme
  
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def forest: forest = "forest".asInstanceOf[forest]
  @scala.inline
  def neutral: neutral = "neutral".asInstanceOf[neutral]
}

