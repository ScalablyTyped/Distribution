package typings.nivoAnnotations

import typings.nivoAnnotations.mod.AnnotationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoAnnotationsStrings {
  @js.native
  sealed trait circle extends AnnotationType
  
  @js.native
  sealed trait dot extends AnnotationType
  
  @js.native
  sealed trait rect extends AnnotationType
  
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  @scala.inline
  def dot: dot = "dot".asInstanceOf[dot]
  @scala.inline
  def rect: rect = "rect".asInstanceOf[rect]
}

