package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ANGLE_instanced_arrays extends js.Object {
  val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum
  def drawArraysInstancedANGLE(mode: GLenum, first: GLint, count: GLsizei, primcount: GLsizei): scala.Unit
  def drawElementsInstancedANGLE(mode: GLenum, count: GLsizei, `type`: GLenum, offset: GLintptr, primcount: GLsizei): scala.Unit
  def vertexAttribDivisorANGLE(index: GLuint, divisor: GLuint): scala.Unit
}

object ANGLE_instanced_arrays {
  @scala.inline
  def apply(
    VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum,
    drawArraysInstancedANGLE: js.Function4[GLenum, GLint, GLsizei, GLsizei, scala.Unit],
    drawElementsInstancedANGLE: js.Function5[GLenum, GLsizei, GLenum, GLintptr, GLsizei, scala.Unit],
    vertexAttribDivisorANGLE: js.Function2[GLuint, GLuint, scala.Unit]
  ): ANGLE_instanced_arrays = {
    val __obj = js.Dynamic.literal(VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE = VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE, drawArraysInstancedANGLE = drawArraysInstancedANGLE, drawElementsInstancedANGLE = drawElementsInstancedANGLE, vertexAttribDivisorANGLE = vertexAttribDivisorANGLE)
  
    __obj.asInstanceOf[ANGLE_instanced_arrays]
  }
}

