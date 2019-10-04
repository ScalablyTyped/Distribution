package typings.pdfkit.PDFKitNs.MixinsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFAnnotation extends js.Object {
  def annotate(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
  def ellipseAnnotation(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def ellipseAnnotation(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
  def goTo(x: Double, y: Double, w: Double, h: Double, name: String): this.type = js.native
  def goTo(x: Double, y: Double, w: Double, h: Double, name: String, options: AnnotationOption): this.type = js.native
  def highlight(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def highlight(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
  def lineAnnotation(x1: Double, y1: Double, x2: Double, y2: Double): this.type = js.native
  def lineAnnotation(x1: Double, y1: Double, x2: Double, y2: Double, option: AnnotationOption): this.type = js.native
  def link(x: Double, y: Double, w: Double, h: Double, url: String): this.type = js.native
  def link(x: Double, y: Double, w: Double, h: Double, url: String, option: AnnotationOption): this.type = js.native
  def note(x: Double, y: Double, w: Double, h: Double, content: String): this.type = js.native
  def note(x: Double, y: Double, w: Double, h: Double, content: String, option: AnnotationOption): this.type = js.native
  def rectAnnotation(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def rectAnnotation(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
  def strike(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def strike(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
  def textAnnotation(x: Double, y: Double, w: Double, h: Double, text: String): this.type = js.native
  def textAnnotation(x: Double, y: Double, w: Double, h: Double, text: String, option: AnnotationOption): this.type = js.native
  def underline(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def underline(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
}

