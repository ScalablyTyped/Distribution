package typings
package pdfkitLib.PDFKitNs.MixinsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFAnnotation[TDocument] extends js.Object {
  def annotate(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, option: AnnotationOption): TDocument = js.native
  def ellipseAnnotation(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): TDocument = js.native
  def ellipseAnnotation(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, option: AnnotationOption): TDocument = js.native
  def goTo(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, name: java.lang.String): TDocument = js.native
  def goTo(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    name: java.lang.String,
    options: AnnotationOption
  ): TDocument = js.native
  def highlight(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): TDocument = js.native
  def highlight(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, option: AnnotationOption): TDocument = js.native
  def lineAnnotation(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): TDocument = js.native
  def lineAnnotation(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, option: AnnotationOption): TDocument = js.native
  def link(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, url: java.lang.String): TDocument = js.native
  def link(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    url: java.lang.String,
    option: AnnotationOption
  ): TDocument = js.native
  def note(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, content: java.lang.String): TDocument = js.native
  def note(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    content: java.lang.String,
    option: AnnotationOption
  ): TDocument = js.native
  def rectAnnotation(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): TDocument = js.native
  def rectAnnotation(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, option: AnnotationOption): TDocument = js.native
  def strike(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): TDocument = js.native
  def strike(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, option: AnnotationOption): TDocument = js.native
  def textAnnotation(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, text: java.lang.String): TDocument = js.native
  def textAnnotation(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    text: java.lang.String,
    option: AnnotationOption
  ): TDocument = js.native
  def underline(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): TDocument = js.native
  def underline(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, option: AnnotationOption): TDocument = js.native
}

