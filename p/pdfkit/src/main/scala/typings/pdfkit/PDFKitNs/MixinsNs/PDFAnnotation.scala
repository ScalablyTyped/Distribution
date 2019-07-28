package typings.pdfkit.PDFKitNs.MixinsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFAnnotation[TDocument] extends js.Object {
  def annotate(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): TDocument = js.native
  def ellipseAnnotation(x: Double, y: Double, w: Double, h: Double): TDocument = js.native
  def ellipseAnnotation(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): TDocument = js.native
  def goTo(x: Double, y: Double, w: Double, h: Double, name: String): TDocument = js.native
  def goTo(x: Double, y: Double, w: Double, h: Double, name: String, options: AnnotationOption): TDocument = js.native
  def highlight(x: Double, y: Double, w: Double, h: Double): TDocument = js.native
  def highlight(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): TDocument = js.native
  def lineAnnotation(x1: Double, y1: Double, x2: Double, y2: Double): TDocument = js.native
  def lineAnnotation(x1: Double, y1: Double, x2: Double, y2: Double, option: AnnotationOption): TDocument = js.native
  def link(x: Double, y: Double, w: Double, h: Double, url: String): TDocument = js.native
  def link(x: Double, y: Double, w: Double, h: Double, url: String, option: AnnotationOption): TDocument = js.native
  def note(x: Double, y: Double, w: Double, h: Double, content: String): TDocument = js.native
  def note(x: Double, y: Double, w: Double, h: Double, content: String, option: AnnotationOption): TDocument = js.native
  def rectAnnotation(x: Double, y: Double, w: Double, h: Double): TDocument = js.native
  def rectAnnotation(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): TDocument = js.native
  def strike(x: Double, y: Double, w: Double, h: Double): TDocument = js.native
  def strike(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): TDocument = js.native
  def textAnnotation(x: Double, y: Double, w: Double, h: Double, text: String): TDocument = js.native
  def textAnnotation(x: Double, y: Double, w: Double, h: Double, text: String, option: AnnotationOption): TDocument = js.native
  def underline(x: Double, y: Double, w: Double, h: Double): TDocument = js.native
  def underline(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): TDocument = js.native
}

