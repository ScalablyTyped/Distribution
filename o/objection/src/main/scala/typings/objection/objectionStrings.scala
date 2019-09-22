package typings.objection

import typings.objection.objectionMod.JsonSchemaFormatType
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
  
  @js.native
  sealed trait date extends JsonSchemaFormatType
  
  @js.native
  sealed trait `date-time` extends JsonSchemaFormatType
  
  @js.native
  sealed trait email extends JsonSchemaFormatType
  
  @js.native
  sealed trait hostname extends JsonSchemaFormatType
  
  @js.native
  sealed trait `idn-email` extends JsonSchemaFormatType
  
  @js.native
  sealed trait `idn-hostname` extends JsonSchemaFormatType
  
  @js.native
  sealed trait ipv4 extends JsonSchemaFormatType
  
  @js.native
  sealed trait ipv6 extends JsonSchemaFormatType
  
  @js.native
  sealed trait iri extends JsonSchemaFormatType
  
  @js.native
  sealed trait `iri-reference` extends JsonSchemaFormatType
  
  @js.native
  sealed trait `json-pointer` extends JsonSchemaFormatType
  
  @js.native
  sealed trait regex extends JsonSchemaFormatType
  
  @js.native
  sealed trait `relative-json-pointer` extends JsonSchemaFormatType
  
  @js.native
  sealed trait time extends JsonSchemaFormatType
  
  @js.native
  sealed trait uri extends JsonSchemaFormatType
  
  @js.native
  sealed trait `uri-reference` extends JsonSchemaFormatType
  
  @js.native
  sealed trait `uri-template` extends JsonSchemaFormatType
  
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
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def `date-time`: `date-time` = "date-time".asInstanceOf[`date-time`]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def hostname: hostname = "hostname".asInstanceOf[hostname]
  @scala.inline
  def `idn-email`: `idn-email` = "idn-email".asInstanceOf[`idn-email`]
  @scala.inline
  def `idn-hostname`: `idn-hostname` = "idn-hostname".asInstanceOf[`idn-hostname`]
  @scala.inline
  def ipv4: ipv4 = "ipv4".asInstanceOf[ipv4]
  @scala.inline
  def ipv6: ipv6 = "ipv6".asInstanceOf[ipv6]
  @scala.inline
  def iri: iri = "iri".asInstanceOf[iri]
  @scala.inline
  def `iri-reference`: `iri-reference` = "iri-reference".asInstanceOf[`iri-reference`]
  @scala.inline
  def `json-pointer`: `json-pointer` = "json-pointer".asInstanceOf[`json-pointer`]
  @scala.inline
  def regex: regex = "regex".asInstanceOf[regex]
  @scala.inline
  def `relative-json-pointer`: `relative-json-pointer` = "relative-json-pointer".asInstanceOf[`relative-json-pointer`]
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  @scala.inline
  def uri: uri = "uri".asInstanceOf[uri]
  @scala.inline
  def `uri-reference`: `uri-reference` = "uri-reference".asInstanceOf[`uri-reference`]
  @scala.inline
  def `uri-template`: `uri-template` = "uri-template".asInstanceOf[`uri-template`]
}

