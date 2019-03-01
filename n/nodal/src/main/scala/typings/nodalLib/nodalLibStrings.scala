package typings
package nodalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodalLibStrings {
  @js.native
  sealed trait ASC extends js.Object
  
  @js.native
  sealed trait DESC extends js.Object
  
  @js.native
  sealed trait DSC extends js.Object
  
  @js.native
  sealed trait boolean
    extends nodalLib.nodalMod.DataType
  
  @js.native
  sealed trait currency
    extends nodalLib.nodalMod.DataType
  
  @js.native
  sealed trait datetime
    extends nodalLib.nodalMod.DataType
  
  @js.native
  sealed trait float
    extends nodalLib.nodalMod.DataType
  
  @js.native
  sealed trait int
    extends nodalLib.nodalMod.DataType
  
  @js.native
  sealed trait json
    extends nodalLib.nodalMod.DataType
  
  @js.native
  sealed trait serial
    extends nodalLib.nodalMod.DataType
  
  @js.native
  sealed trait string
    extends nodalLib.nodalMod.DataType
  
  @js.native
  sealed trait text
    extends nodalLib.nodalMod.DataType
  
  @scala.inline
  def ASC: ASC = "ASC".asInstanceOf[ASC]
  @scala.inline
  def DESC: DESC = "DESC".asInstanceOf[DESC]
  @scala.inline
  def DSC: DSC = "DSC".asInstanceOf[DSC]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def currency: currency = "currency".asInstanceOf[currency]
  @scala.inline
  def datetime: datetime = "datetime".asInstanceOf[datetime]
  @scala.inline
  def float: float = "float".asInstanceOf[float]
  @scala.inline
  def int: int = "int".asInstanceOf[int]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def serial: serial = "serial".asInstanceOf[serial]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
}

