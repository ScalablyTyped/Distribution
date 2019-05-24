package typings
package atNivoAnnotationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atNivoAnnotationsLibStrings {
  @js.native
  sealed trait circle
    extends atNivoAnnotationsLib.atNivoAnnotationsMod.AnnotationType
  
  @js.native
  sealed trait dot
    extends atNivoAnnotationsLib.atNivoAnnotationsMod.AnnotationType
  
  @js.native
  sealed trait rect
    extends atNivoAnnotationsLib.atNivoAnnotationsMod.AnnotationType
  
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  @scala.inline
  def dot: dot = "dot".asInstanceOf[dot]
  @scala.inline
  def rect: rect = "rect".asInstanceOf[rect]
}

