package typings.onfidoOpencv.mod

import typings.mirada.distSrcTypesOpencvHacksMod.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@onfido/opencv", "Exception")
@js.native
/**
  *   Default constructor
  */
open class Exception ()
  extends typings.mirada.mod.Exception {
  /**
    *   Full constructor. Normally the constructor is not called explicitly. Instead, the macros
    * [CV_Error()], [CV_Error_()] and [CV_Assert()] are used.
    */
  def this(_code: int, _err: String, _func: String, _file: String, _line: int) = this()
}
