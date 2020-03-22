package typings.objection

import typings.objection.mod.OrderByDirection
import typings.objection.mod.ValidationErrorType
import typings.objection.mod._JSONSchemaTypeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object objectionStrings {
  @js.native
  sealed trait ASC extends OrderByDirection
  
  @js.native
  sealed trait DESC extends OrderByDirection
  
  @js.native
  sealed trait InvalidGraph extends ValidationErrorType
  
  @js.native
  sealed trait ModelObject extends js.Object
  
  @js.native
  sealed trait ModelValidation extends ValidationErrorType
  
  @js.native
  sealed trait NotFound extends js.Object
  
  @js.native
  sealed trait PartialModelGraph extends js.Object
  
  @js.native
  sealed trait PartialModelObject extends js.Object
  
  @js.native
  sealed trait QueryBuilderType extends js.Object
  
  @js.native
  sealed trait RelationExpression extends ValidationErrorType
  
  @js.native
  sealed trait UnallowedRelation extends ValidationErrorType
  
  @js.native
  sealed trait array extends _JSONSchemaTypeName
  
  @js.native
  sealed trait asc_ extends OrderByDirection
  
  @js.native
  sealed trait boolean extends _JSONSchemaTypeName
  
  @js.native
  sealed trait desc_ extends OrderByDirection
  
  @js.native
  sealed trait integer extends _JSONSchemaTypeName
  
  @js.native
  sealed trait `null` extends _JSONSchemaTypeName
  
  @js.native
  sealed trait number extends _JSONSchemaTypeName
  
  @js.native
  sealed trait `object` extends _JSONSchemaTypeName
  
  @js.native
  sealed trait string extends _JSONSchemaTypeName
  
  @scala.inline
  def ASC: ASC = "ASC".asInstanceOf[ASC]
  @scala.inline
  def DESC: DESC = "DESC".asInstanceOf[DESC]
  @scala.inline
  def InvalidGraph: InvalidGraph = "InvalidGraph".asInstanceOf[InvalidGraph]
  @scala.inline
  def ModelObject: ModelObject = "ModelObject".asInstanceOf[ModelObject]
  @scala.inline
  def ModelValidation: ModelValidation = "ModelValidation".asInstanceOf[ModelValidation]
  @scala.inline
  def NotFound: NotFound = "NotFound".asInstanceOf[NotFound]
  @scala.inline
  def PartialModelGraph: PartialModelGraph = "PartialModelGraph".asInstanceOf[PartialModelGraph]
  @scala.inline
  def PartialModelObject: PartialModelObject = "PartialModelObject".asInstanceOf[PartialModelObject]
  @scala.inline
  def QueryBuilderType: QueryBuilderType = "QueryBuilderType".asInstanceOf[QueryBuilderType]
  @scala.inline
  def RelationExpression: RelationExpression = "RelationExpression".asInstanceOf[RelationExpression]
  @scala.inline
  def UnallowedRelation: UnallowedRelation = "UnallowedRelation".asInstanceOf[UnallowedRelation]
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def asc_ : asc_ = "asc".asInstanceOf[asc_]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def desc_ : desc_ = "desc".asInstanceOf[desc_]
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  @scala.inline
  def `null`: `null` = "null".asInstanceOf[`null`]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
}

