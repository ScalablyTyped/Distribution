package typings.objection

import typings.objection.objectionMod.ValidationErrorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object objectionStrings {
  @js.native
  sealed trait DeepPartialGraphModel extends js.Object
  
  @js.native
  sealed trait GraphModel extends js.Object
  
  @js.native
  sealed trait InvalidGraph extends ValidationErrorType
  
  @js.native
  sealed trait ModelValidation extends ValidationErrorType
  
  @js.native
  sealed trait PartialUpdate extends js.Object
  
  @js.native
  sealed trait RelationExpression extends ValidationErrorType
  
  @js.native
  sealed trait UnallowedRelation extends ValidationErrorType
  
  @scala.inline
  def DeepPartialGraphModel: DeepPartialGraphModel = "DeepPartialGraphModel".asInstanceOf[DeepPartialGraphModel]
  @scala.inline
  def GraphModel: GraphModel = "GraphModel".asInstanceOf[GraphModel]
  @scala.inline
  def InvalidGraph: InvalidGraph = "InvalidGraph".asInstanceOf[InvalidGraph]
  @scala.inline
  def ModelValidation: ModelValidation = "ModelValidation".asInstanceOf[ModelValidation]
  @scala.inline
  def PartialUpdate: PartialUpdate = "PartialUpdate".asInstanceOf[PartialUpdate]
  @scala.inline
  def RelationExpression: RelationExpression = "RelationExpression".asInstanceOf[RelationExpression]
  @scala.inline
  def UnallowedRelation: UnallowedRelation = "UnallowedRelation".asInstanceOf[UnallowedRelation]
}

