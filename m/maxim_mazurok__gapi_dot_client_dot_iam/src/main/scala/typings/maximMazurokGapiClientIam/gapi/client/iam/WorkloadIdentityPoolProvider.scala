package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkloadIdentityPoolProvider extends StObject {
  
  /**
    * [A Common Expression Language](https://opensource.google/projects/cel) expression, in plain text, to restrict what otherwise valid authentication credentials issued by the provider
    * should not be accepted. The expression must output a boolean representing whether to allow the federation. The following keywords may be referenced in the expressions: *
    * `assertion`: JSON representing the authentication credential issued by the provider. * `google`: The Google attributes mapped from the assertion in the `attribute_mappings`. *
    * `attribute`: The custom attributes mapped from the assertion in the `attribute_mappings`. The maximum length of the attribute condition expression is 4096 characters. If
    * unspecified, all valid authentication credential are accepted. The following example shows how to only allow credentials with a mapped `google.groups` value of `admins`: ```
    * "'admins' in google.groups" ```
    */
  var attributeCondition: js.UndefOr[String] = js.undefined
  
  /**
    * Maps attributes from authentication credentials issued by an external identity provider to Google Cloud attributes, such as `subject` and `segment`. Each key must be a string
    * specifying the Google Cloud IAM attribute to map to. The following keys are supported: * `google.subject`: The principal IAM is authenticating. You can reference this value in IAM
    * bindings. This is also the subject that appears in Cloud Logging logs. Cannot exceed 127 bytes. * `google.groups`: Groups the external identity belongs to. You can grant groups
    * access to resources using an IAM `principalSet` binding; access applies to all members of the group. You can also provide custom attributes by specifying
    * `attribute.{custom_attribute}`, where `{custom_attribute}` is the name of the custom attribute to be mapped. You can define a maximum of 50 custom attributes. The maximum length of
    * a mapped attribute key is 100 characters, and the key may only contain the characters [a-z0-9_]. You can reference these attributes in IAM policies to define fine-grained access for
    * a workload to Google Cloud resources. For example: * `google.subject`:
    * `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}` * `google.groups`:
    * `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}` * `attribute.{custom_attribute}`:
    * `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}` Each value must be a [Common Expression
    * Language] (https://opensource.google/projects/cel) function that maps an identity provider credential to the normalized attribute specified by the corresponding map key. You can use
    * the `assertion` keyword in the expression to access a JSON representation of the authentication credential issued by the provider. The maximum length of an attribute mapping
    * expression is 2048 characters. When evaluated, the total size of all mapped attributes must not exceed 8KB. For AWS providers, if no attribute mapping is defined, the following
    * default mapping applies: ``` { "google.subject":"assertion.arn", "attribute.aws_role": "assertion.arn.contains('assumed-role')" " ?
    * assertion.arn.extract('{account_arn}assumed-role/')" " + 'assumed-role/'" " + assertion.arn.extract('assumed-role/{role_name}/')" " : assertion.arn", } ``` If any custom attribute
    * mappings are defined, they must include a mapping to the `google.subject` attribute. For OIDC providers, you must supply a custom mapping, which must include the `google.subject`
    * attribute. For example, the following maps the `sub` claim of the incoming credential to the `subject` attribute on a Google token: ``` {"google.subject": "assertion.sub"} ```
    */
  var attributeMapping: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** An Amazon Web Services identity provider. */
  var aws: js.UndefOr[Aws] = js.undefined
  
  /** A description for the provider. Cannot exceed 256 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Whether the provider is disabled. You cannot use a disabled provider to exchange tokens. However, existing tokens still grant access. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** A display name for the provider. Cannot exceed 32 characters. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of the provider. */
  var name: js.UndefOr[String] = js.undefined
  
  /** An OpenId Connect 1.0 identity provider. */
  var oidc: js.UndefOr[Oidc] = js.undefined
  
  /** An SAML 2.0 identity provider. */
  var saml: js.UndefOr[Saml] = js.undefined
  
  /** Output only. The state of the provider. */
  var state: js.UndefOr[String] = js.undefined
}
object WorkloadIdentityPoolProvider {
  
  inline def apply(): WorkloadIdentityPoolProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkloadIdentityPoolProvider]
  }
  
  extension [Self <: WorkloadIdentityPoolProvider](x: Self) {
    
    inline def setAttributeCondition(value: String): Self = StObject.set(x, "attributeCondition", value.asInstanceOf[js.Any])
    
    inline def setAttributeConditionUndefined: Self = StObject.set(x, "attributeCondition", js.undefined)
    
    inline def setAttributeMapping(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "attributeMapping", value.asInstanceOf[js.Any])
    
    inline def setAttributeMappingUndefined: Self = StObject.set(x, "attributeMapping", js.undefined)
    
    inline def setAws(value: Aws): Self = StObject.set(x, "aws", value.asInstanceOf[js.Any])
    
    inline def setAwsUndefined: Self = StObject.set(x, "aws", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOidc(value: Oidc): Self = StObject.set(x, "oidc", value.asInstanceOf[js.Any])
    
    inline def setOidcUndefined: Self = StObject.set(x, "oidc", js.undefined)
    
    inline def setSaml(value: Saml): Self = StObject.set(x, "saml", value.asInstanceOf[js.Any])
    
    inline def setSamlUndefined: Self = StObject.set(x, "saml", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
