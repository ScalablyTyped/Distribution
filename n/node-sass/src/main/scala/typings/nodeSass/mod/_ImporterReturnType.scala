package typings.nodeSass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ImporterReturnType extends js.Object

object _ImporterReturnType {
  @scala.inline
  def AnonFile(file: String): _ImporterReturnType = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_ImporterReturnType]
  }
  @scala.inline
  def AnonContents(contents: String, file: String = null): _ImporterReturnType = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ImporterReturnType]
  }
  @scala.inline
  def Null(___NULL___ : js.Symbol): _ImporterReturnType = {
    val __obj = js.Dynamic.literal(___NULL___ = ___NULL___.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_ImporterReturnType]
  }
  @scala.inline
  def Error(___SASS_ERROR___ : js.Symbol): _ImporterReturnType = {
    val __obj = js.Dynamic.literal(___SASS_ERROR___ = ___SASS_ERROR___.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_ImporterReturnType]
  }
}

