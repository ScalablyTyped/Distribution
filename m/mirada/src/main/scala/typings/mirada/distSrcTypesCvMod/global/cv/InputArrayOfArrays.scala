package typings.mirada.distSrcTypesCvMod.global.cv

import typings.mirada.anon.TypeofInputArrayOfArrays
import typings.mirada.distSrcTypesCvMod.global.cv.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("cv.InputArrayOfArrays")
@js.native
/**
  *   These are various constructors that form a matrix. As noted in the AutomaticAllocation, often the
  * default constructor is enough, and the proper matrix will be allocated by an OpenCV function. The
  * constructed matrix can further be assigned to another matrix or matrix expression or can be
  * allocated with [Mat::create] . In the former case, the old content is de-referenced.
  */
open class InputArrayOfArrays ()
  extends typings.mirada.distSrcTypesOpencvTypesMod.InputArrayOfArrays
object InputArrayOfArrays {
  
  inline def apply: TypeofInputArrayOfArrays = ^.asInstanceOf[js.Dynamic].selectDynamic("InputArrayOfArrays").asInstanceOf[TypeofInputArrayOfArrays]
}
